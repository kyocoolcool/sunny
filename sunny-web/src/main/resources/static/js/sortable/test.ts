//先取消
// function onMove(evt) {
//     if (evt.to !== evt.from) {
//         evt.to.appendChild(evt.dragged);
//         return true;
//     }
// }
let count = 1;

let options = {
    group: {
        name: 'list',
        /*四種參數:to,from,item,evt*/
        put: function (to, from, item, evt, a) {
            console.log({'from': from});
            let aa = to.el.children;
            var arr = [].slice.call(aa);
            if (to.el.children.length != 0) {
                // console.log("111");
                // console.log("arr[0].className" + arr[0].className);
                // console.log("from.el.className" + from.el.className);
                if (arr[0].className == from.el.className) {
                    // console.log("222");
                    // console.log("arr[0].className" + arr[0].className);
                    // console.log("from.el.className" + from.el.className);
                    return false;
                }
                // console.log({'arr': arr[0].className});
            }

            // console.log({'aa0': aa[0]});
            // console.log({'aa1': aa[1]});
            // console.log({'to': to.el.children[1]});
            // console.log(to.el.children[0]);
            // console.log(to.el.children[1]);
            return to.el.children.length < 2;
            // return true;
        }
    },
    // onMove: onMove,
    animation: 100,
    emptyInsertThreshold: 5, // this is the default
    // onAdd: function (evt) {
    //
    //     console.log("6666666666666666666")
    // }
};

let events = [
    'onChoose',
    'onStart',
    'onEnd',
    'onAdd',
    'onUpdate',
    'onSort',
    'onRemove',
    'onChange',
    'onUnchoose'
].forEach(function (name) {
    options[name] = function (evt) {
        if (name == 'onAdd') {
            if (evt.to.children.length > 1) {
                if (count == evt.to.className.slice(4)) {
                    let tempCount = count;
                    count++;
                    var tempElemet = document.createElement("div");
                    tempElemet.setAttribute("id", "element" + count);
                    let tempText = "<h4 id='title" + count + "'>List" + count + "</h4><div id='list" + count + "' class='list" + count + "'></div>";
                    tempElemet.innerHTML = tempText;
                    document.getElementById('element' + (count - 1)).before(tempElemet);
                    // let obja:object =eval('({' + 'list'+tempCount + '})');
                    // console.log({'list2': list2});
                    // Sortable.create(list2, options);
                    var myElement = document.getElementById('list' + count);
                    console.log({'myElement': myElement});
                    Sortable.create(myElement, options);
                }
            }
        }
        console.log({
            'event': name,
            'this': this,
            'item': evt.item,
            'from': evt.from,
            'to': evt.to,
            'oldIndex': evt.oldIndex,
            'newIndex': evt.newIndex
        });
    };
});

/*先關閉list1*/
// Sortable.create(list1, {
//     group: 'list1',
//     animation: 100
// });

Sortable.create(listA, {
    group: {
        name: 'list2',
        // 可以放的區域來源端，可用陣列
        // put: ['list1', 'list2'],
        // 如果要放過去，來源端數量小於3就用複製
        // pull: function (to, from) {
        //     return from.el.children.length > 3 || 'clone';
        // }
    },
    animation: 100
});

Sortable.create(listB, {
    group: {
        name: 'listB',
        // 可以放方法限制目的端只能多少數量
        put: 'listB'
    },
});

Sortable.create(list1, options);
Sortable.create(removeZone, {
    group: 'list',
    animation: 100,
    onAdd: function (evt) {
        document.getElementById(evt.item.className).prepend(evt.item);
    }
});

/*支援Table*/
Sortable.create(table1, {});


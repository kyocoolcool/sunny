/**
 * 定義onMove Function 當有onMove Event時執行此Code
 * {@link onMove}
 */
function onMove(evt) {
    if (evt.to !== evt.from) {
        evt.to.appendChild(evt.dragged);
        return true;
    }
}

let count = 1;

let options = {
    group: {
        name: 'list',
        /**四種參數:to,from,item,evt*/
        put: function (to, from, item, evt, a) {
            console.log({'from': from});
            let aa = to.el.children;
            var arr = [].slice.call(aa);
            if (to.el.children.length != 0) {
                if (arr[0].className == from.el.className) {
                    return false;
                }
            }
            /**限制目的端只能多少數量*/
            return to.el.children.length < 2;
        }
    },
    /**
     * @description: 有多種事件去擴充處理，本例已onMove演示
     * @see onMove
     */
    onMove: onMove,
    animation: 100,
    emptyInsertThreshold: 5, /**this is the default*/
};

/**事件處理*/
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
    /**定義各event需特別處理的動作，最後封裝載options中*/
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

/**
 * @description: 創建sortable物件
 * @param listA,放入元素(此處放入物件id，套件會去取得該id的元素)
 */
Sortable.create(listA, {
    group: {
        name: 'list2',
        /**可以放的區域來源端，可用陣列或單字串*/
        // put: ['list1', 'list2'],
        /**如果要放過去，來源端數量小於3就用複製*/
        // pull: function (to, from) {
        //     return from.el.children.length > 3 || 'clone';
        // }
    },
    animation: 100
});

Sortable.create(listB, {
    group: {
        name: 'listB',
        put: 'listB'
    },
});

Sortable.create(list1, options);

/**
 * @description: 實作回收區，當元素放入後會自動辨別是ListA或ListB歸還放在第一位置
 * @author: Chris Chen
 * @time: 2019-08-30 15:24
 */
Sortable.create(removeZone, {
    group: 'list',
    animation: 100,
    onAdd: function (evt) {
        document.getElementById(evt.item.className).prepend(evt.item);
    }
});

/*支援Table*/
Sortable.create(table1, {});


/**創建一個類別用來存放數據*/
class Passenger {
    name: string;
    age: number;

    constructor(n?: string, m?: number) {
        this.name = n;
        this.age = m;
    }


    setName(name: string): void {
        this.name = name;

    }

    getName(): string {
        return this.name;
    }


    getAge(): number {
        return this.age;
    }

    setAge(value: number) {
        this.age = value;
    }
}

function hello() {


    /**創建陣列*/
    var arr = new Array();

    console.log('countFirst:' + count);
    for (var j = 1; j <= count; j++) {


        let listTemp = '#list' + j;
        console.log("listTemp"+listTemp);


        /**透過jquery Select取得元素*/
        var trList = $(listTemp).children("tr");
        if (trList.length == 2) {
            /**循環該元素數量次數*/
            for (var i = 0; i < trList.length; i++) {
                /**創造物件*/
                let passenger = new Passenger();
                var tdArr = trList.eq(i).find("td");
                var temp1 = tdArr.eq(0).text();
                var temp2 = tdArr.eq(1).text();
                passenger.setName(temp1);
                passenger.setAge(temp2);
                arr.push(passenger);
                /**將物件放入陣列中*/
                // console.log(passenger.name);
                // console.log(passenger.age);
                // console.log(arr);
            }
        }
    }
    let arrJson=JSON.stringify(arr)
    console.log(arrJson);
    /**陣列轉為JSON字串*/
    console.log('count:' + count);

    $.ajax({
        type: 'POST',
        url: '/sunny-web/passengerMapping',
        data: arrJson, // or JSON.stringify ({name: 'jonas'}),
        success: function(data) { alert('data: ' + data); },
        contentType: "application/json",
        dataType: 'json'
    });
}

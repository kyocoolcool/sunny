package kyocoolcool.controller;

import cn.hutool.core.util.StrUtil;
import kyocoolcool.model.Passenger;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * @ClassName controller
 * @Description API使用controller
 * @Author Chris Chen
 * @Date 2019-08-19 16:40
 * @Version 1.0
 **/
@RestController
public class ApiController {

    @GetMapping("/hello")
    public String sayHello(@RequestParam(required = false, name = "who") String who) {
        System.out.println("hello");
        if (StrUtil.isBlank(who)) {
            who = "World";
        }
        return StrUtil.format("Hello, {}!", who);
    }

    @PostMapping("/passengerMapping")
    public String passengerMapping(@RequestBody ConcurrentLinkedQueue<Passenger> passengerQueue) {
        System.out.println("hello");
        System.out.println("passengerList" + passengerQueue);
//        passengerList.forEach((x)-> System.out.println(x));
        int size = passengerQueue.size();
        for (int i = 0; i < size / 2; i++) {
            Passenger passenger = passengerQueue.poll();
            Passenger passenger1 = passengerQueue.poll();
            System.out.println(passenger);
            System.out.println(passenger1);
        }
        System.out.println(size);
        return StrUtil.format("passengerList: {}", passengerQueue);
    }

    @PostMapping("/test1")
    public String test1() {

        return "Yes";
    }
}
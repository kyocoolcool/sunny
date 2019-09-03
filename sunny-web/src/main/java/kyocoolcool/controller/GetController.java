package kyocoolcool.controller;

import kyocoolcool.model.Passenger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

/**
 * @ClassName GetController
 * @Description TODO
 * @Author Chris Chen
 * @Date 2019-08-19 17:40
 * @Version 1.0
 **/
@Controller
public class GetController {
    @GetMapping("/sortable")
    public String sortable() {
        return "sortable.html";
    }

    @GetMapping("/draggable")
    public String draggable() {
        return "draggable.html";
    }

    @GetMapping("/sortable2")
    public String sortable2() {
        return "sortable2.html";
    }

    @GetMapping("/sortable3")
    public String sortable3() {
        return "sortable3.html";
    }

    @GetMapping("/sortable4")
    public String sortable4() {
        return "sortable4.html";
    }

    @GetMapping("/sortable5")
    public String sortable5() {
        return "sortable5.html";
    }

    @GetMapping("/sortable6")
    public String sortable6() {
        return "sortable6.html";
    }

    @RequestMapping("/sortable7")
    public String sortable7(Model model) {
        ArrayList<Passenger> passengerList = new ArrayList<>();
        Passenger passenger = new Passenger();
        passenger.setName("Chris");
        passenger.setAge(30);
        Passenger passenger2 = new Passenger();
        passenger2.setName("Mine");
        passenger2.setAge(18);
        passengerList.add(passenger);
        passengerList.add(passenger2);
        model.addAttribute("passengerList", passengerList);

        ArrayList<Passenger> passengerList2 = new ArrayList<>();
        Passenger passenger3 = new Passenger();
        passenger3.setName("Wang");
        passenger3.setAge(50);
        Passenger passenger4 = new Passenger();
        passenger4.setName("Annie");
        passenger4.setAge(20);
        passengerList2.add(passenger3);
        passengerList2.add(passenger4);
        model.addAttribute("passengerList2", passengerList2);

        model.addAttribute("hello", "hello");
        return "sortable7";
    }

    @RequestMapping(value = "/save", method = {RequestMethod.GET, RequestMethod.POST})
    public String savePassenger(@RequestParam("passengerName") String passengerName) {
        System.out.println(passengerName);
        return "redirect:/sortable7";
    }
}
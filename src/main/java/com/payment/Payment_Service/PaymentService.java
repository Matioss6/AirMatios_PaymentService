package com.payment.Payment_Service;


import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentService {

    static boolean ToFailOrNotToFailThatIsTheQuestion;

    @GetMapping("payment")
    String payment(Iterable<Orders> orders) throws NotEnoughMoneyException {

        System.out.println("Próba opłaty za zamówienie \n");
        System.out.println("Magia / Magia / Magia");
        if(!ToFailOrNotToFailThatIsTheQuestion) {
            ToFailOrNotToFailThatIsTheQuestion=true;
            System.out.println("sukces get");
            return "Sukces !"; }
        else
            System.out.println("fail get");
            ToFailOrNotToFailThatIsTheQuestion=false;
            throw new NotEnoughMoneyException();
    }

    @PostMapping("payment")
    @Transactional
    String paymentt() throws NotEnoughMoneyException {

        System.out.println("Próba opłaty za zamówienie \n");
        System.out.println("Magia / Magia / Magia");
        if(!ToFailOrNotToFailThatIsTheQuestion) {
            ToFailOrNotToFailThatIsTheQuestion=true;
            System.out.println("sukces");
            return "Sukces !"; }
        else
            ToFailOrNotToFailThatIsTheQuestion=false;
        System.out.println("fail");
        throw new NotEnoughMoneyException();
    }
}

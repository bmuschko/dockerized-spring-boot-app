package com.bmuschko.account;

import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    @RequestMapping(method=RequestMethod.GET)
    public @ResponseBody Account getAccount(@RequestParam Long id) {
        if (id.equals(1L)) {
            return new Account(1L, "John Doe", new BigDecimal(34024.23));
        } else if (id.equals(2L)) {
            return new Account(2L, "Foo Bar", new BigDecimal(-239.79));
        }

        throw new IllegalArgumentException(String.format("Account with ID %s could not be found", id));
    }

}
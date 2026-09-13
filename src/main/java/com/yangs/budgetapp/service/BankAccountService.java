package com.yangs.budgetapp.service;

import com.yangs.budgetapp.models.User;
import com.yangs.budgetapp.models.UserClassification;
import org.springframework.stereotype.Service;

@Service
public class BankAccountService {

    public BankAccountService() {
        User emily = new User("Emily", "Yang");

    }

    private void isUserRich(User user) {
        if (user.getFirstName().equals("Goober")) {
            user.setClassification(UserClassification.RICH);
        }
    }
}

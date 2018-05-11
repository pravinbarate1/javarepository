package com.company.collections;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class InterestCalculator
 */
@Stateless
@LocalBean
public class InterestCalculator implements InterestCalculatorRemote, InterestCalculatorLocal {

    /**
     * Default constructor. 
     */
    public InterestCalculator() {
        // TODO Auto-generated constructor stub
    }

}

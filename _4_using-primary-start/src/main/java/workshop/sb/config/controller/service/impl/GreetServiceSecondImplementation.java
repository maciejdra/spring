package workshop.sb.config.controller.service.impl;

import workshop.sb.config.controller.service.GreetService;

public class GreetServiceSecondImplementation implements GreetService {

    public static String second = " second";

    @Override
    public String getMsg() {
        return MSG + second;
    }
}

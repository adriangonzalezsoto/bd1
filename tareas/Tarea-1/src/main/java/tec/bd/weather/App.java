package tec.bd.weather;

import picocli.CommandLine;

public class App {

    public static void main( String[] args ) { // by modifying "program arguments is running "by-zip" using WeatherByZipCodeCommand

        CommandLine cmd = new CommandLine(new MainCommand());
        cmd.setExecutionStrategy(new CommandLine.RunAll()); //default is RunLast
        cmd.execute(args);

        if (args.length == 0) {                                       // this is giving me an error "String cannot be assinget to int function"
            cmd.usage(System.out);
       }

//        WeatherService weatherService = new WeatherServiceImpl();
//        System.out.println(weatherService.getTemperature(city: "Alajuela"));

    }

}

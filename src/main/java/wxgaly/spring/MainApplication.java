package wxgaly.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import wxgaly.spring.bean.HelloWorld;
import wxgaly.spring.di.TextEditor;


public class MainApplication {

    public static void main(String[] args) {
        startApplication();
//        testQuartz();
    }

    private static void testQuartz() {

//        try {
//
//            String cron = "* * * * * ? *";
//
//            SchedulerFactory schedulerFactory = new StdSchedulerFactory();
//            Scheduler scheduler = schedulerFactory.getScheduler();
//
//            JobDetail job = JobBuilder.newJob(HelloJob.class)
//                    .withIdentity("myJob")
//                    .build();
//
//            Trigger trigger = TriggerBuilder.newTrigger()
//                    .withIdentity(TriggerKey.triggerKey("myTrigger", "myTriggerGroup"))
//                    .startNow()
//                    .withSchedule(CronScheduleBuilder.cronSchedule(cron))
//                    .build();
//
//            scheduler.scheduleJob(job, trigger);
//            scheduler.start();
//
//        } catch (SchedulerException e) {
//            e.printStackTrace();
//        }

    }


    private static void startApplication() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("Beans.xml");
//        testBean(context);
        testDI(context);
    }

    private static void testDI(ApplicationContext context) {
        TextEditor te = (TextEditor) context.getBean("textEditor");
        te.spellCheck();
    }

    private static void testBean(ApplicationContext context) {
        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
        obj.getMessage();
    }


}

package com.company.ObserverPattern;

import com.company.ObserverPattern.interfaces.Observer;
import com.company.ObserverPattern.models.EmailTopic;
import com.company.ObserverPattern.models.EmailTopicSubscriber;

public class Main {
    public static void main(String[] args){
        EmailTopic topic = new EmailTopic();

        Observer firstOberver = new EmailTopicSubscriber("FirstOberver");
        Observer secondOberver = new EmailTopicSubscriber("SecondOberver");
        Observer thirdOberver = new EmailTopicSubscriber("ThirdOberver");

        topic.register(firstOberver);
        topic.register(secondOberver);
        topic.register(thirdOberver);

        firstOberver.setSubject(topic);
        secondOberver.setSubject(topic);
        thirdOberver.setSubject(topic);

        firstOberver.update();
        secondOberver.update();

        //Subject (Broadcaster) to all
        topic.postMessage("Hello Subscribers!");
    }
}

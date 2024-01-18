package com.bot;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class simpleBot extends TelegramLongPollingBot {
    @Override
    public void onUpdateReceived(Update update) {
        System.out.println(update.getMessage().getText());
        System.out.println("User is: " + update.getMessage().getFrom().getFirstName());

        String command = update.getMessage().getText();

        if (command.equals("/run")){
            String message = "Bot is Running------------>";
            SendMessage response = new SendMessage();
            response.setChatId(update.getMessage().getChatId().toString());
            response.setText(message);

            try {
                execute(response);
            } catch (TelegramApiException E){
                E.printStackTrace();
            }
        }

        if (command.equals("Java")){
            String message = "\n" +
                    "Java is a versatile, object-oriented programming language known for its platform independence. It's widely used for web development, mobile apps (Android), enterprise systems, and more. With a robust ecosystem and strong community support, Java facilitates scalable and secure applications. Its \"write once, run anywhere\" philosophy, bytecode compilation, and extensive libraries contribute to its enduring popularity. Java remains a foundational technology for building diverse software solutions across industries, powering critical systems globally.";
            SendMessage response = new SendMessage();
            response.setChatId(update.getMessage().getChatId().toString());
            response.setText(message);

            try {
                execute(response);
            } catch (TelegramApiException E){
                E.printStackTrace();
            }
        }

        if (command.equals("Python")){
            String message = "\n" +
                    "Python is a high-level, interpreted programming language celebrated for its readability and simplicity. Widely used in web development, data science, artificial intelligence, and automation, Python's versatility is evident. Its extensive libraries, such as NumPy and Django, accelerate development. Python's community-driven approach and dynamic typing make it accessible to beginners and powerful for experts. With a syntax emphasizing code readability, Python has become a go-to language for diverse applications, from scripting to complex software development. Its popularity stems from its user-friendly nature, fostering innovation in industries ranging from academia to tech giants.";
            SendMessage response = new SendMessage();
            response.setChatId(update.getMessage().getChatId().toString());
            response.setText(message);

            try {
                execute(response);
            } catch (TelegramApiException E){
                E.printStackTrace();
            }
        }

        if (command.equals("C")){
            String message = "\n" +
                    "C is a powerful, procedural programming language known for its efficiency and low-level memory manipulation capabilities. Developed in the early 1970s, it became the foundation for numerous operating systems, including Unix. Its syntax influenced many languages, fostering a deep understanding of computer architecture. C is extensively used in system programming, embedded systems, and game development. While lacking some modern abstractions, C's simplicity, performance, and versatility persist, making it a fundamental language in computer science education. Its influence extends to contemporary languages, and it remains vital in creating efficient, high-performance software across diverse computing domains.";
            SendMessage response = new SendMessage();
            response.setChatId(update.getMessage().getChatId().toString());
            response.setText(message);

            try {
                execute(response);
            } catch (TelegramApiException E){
                E.printStackTrace();
            }
        }

        if (command.equals("C++")){
            String message = "\n" +
                    "C++ is a versatile, object-oriented programming language evolved from C. Renowned for its performance, C++ empowers software development across various domains. Its features, including classes, inheritance, and polymorphism, facilitate modular and efficient code design. Widely used in system software, game development, and high-performance applications, C++ combines low-level control with high-level abstractions. Standard Template Library (STL) enhances productivity. C++11 onwards introduces modern features, further expanding its capabilities. With a rich history and ongoing development, C++ remains integral to industries requiring robust, efficient, and scalable software solutions. Its influence extends to diverse technologies, contributing to the programming landscape's evolution.";
            SendMessage response = new SendMessage();
            response.setChatId(update.getMessage().getChatId().toString());
            response.setText(message);

            try {
                execute(response);
            } catch (TelegramApiException E){
                E.printStackTrace();
            }
        }
    }

    @Override
    public String getBotUsername() {
        return "CSS102SimpleBot";
    }

    @Override
    public String getBotToken() {
        return "6940942095:AAExud20_DplUqOOPUz5_6N3GMRhxFHxC_c";
    }
}

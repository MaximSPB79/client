package server;

import server.handler.ClientHandler;

import java.io.*;

public class Story {

    private File history;
    private ClientHandler handler;

    public Story(ClientHandler handler) {
        this.handler = handler;
    }

    public void saveHistory(String message) {
        try {
            history = new File("src/main/resources/history.txt");
            try (PrintWriter writer = new PrintWriter(new FileWriter(history, true))) {
                System.out.println("Запишем сообщение в историю");
                writer.println(message);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void loadHistory() throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/history.txt"))) {
            int lines = 0;
            while (reader.readLine() != null) lines++;
        }


        /*int posHistory = 100;
        ArrayList<String> historyList = new ArrayList<>();

        //FileInputStream in = new FileInputStream(history);
        //BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in));

        String temp = ;
        while ((temp = bufferedReader.readLine()) != null) {
            historyList.add(temp);
        }

        if (!(historyList.size() <= posHistory)) {
            for (int i = historyList.size() - posHistory; i <= (historyList.size() - 1); i++) {
                chatController.getChatHistory().appendText(historyList.get(i) + "\n");
            }
        } else {
            for (int i = 0; i < posHistory; i++) {
                System.out.println(historyList.get(i));
            }
        }*/
    }
   /* private LinkedList<String> story = new LinkedList<>();

    public void addStoryEl(String el) {
        // если сообщений больше 100, удаляем первое и добавляем новое
        // иначе просто добавить
        if (story.size() >= 100) {
            story.removeFirst();
            story.add(el);
        } else {
            story.add(el);
        }
    }

    public void printStory(DataOutputStream writer) {
        if(story.size() > 0) {
            try {
                writer.write(Integer.parseInt("History messages" + "\n"));
                for (String vr : story) {
                    writer.write(Integer.parseInt(vr + "\n"));
                }
                writer.write(Integer.parseInt("/...." + "\n"));
                writer.flush();
            } catch (IOException ignored) {}
        }
    }*/
}

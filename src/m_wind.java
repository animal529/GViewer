import javax.swing.*;
public class m_wind { // создание класса главного окна

    // конструктор класса m_wind
    m_wind()
    {
        //создание контейнера верхнего уровня, в котором будут размещаться
        //все компоненты
        JFrame m_window = new JFrame("GViewer");
        //задаем размеры главного окна
        m_window.setSize(1024,768);
        //определяем стандартное действие при закрытии окна: EXIT_ON_CLOSE -
        // завершение программы
        m_window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // делаем окно видимым
        m_window.setVisible(true);

    }

    // метод main в данном случае просто создает объект класса m_wind в потоке
    // обработки событий

    public static void  main(String args[])
    {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new m_wind();
            }
        });
    }

}

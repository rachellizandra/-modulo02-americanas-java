package Aula01;

import java.time.LocalDateTime;
import java.util.Date;

public class Calendar {

    private LocalDateTime data;

    public Calendar(LocalDateTime data) {
        this.data = data;
    }

    public static Calendar getInstance() {
        return null;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

}

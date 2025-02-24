package db;

import java.io.Serial;

public class DbExcepction extends RuntimeException{
    @Serial
    private static final long serialVersionUID = 1L;

    public DbExcepction(String msg) {
        super(msg);
    }
}

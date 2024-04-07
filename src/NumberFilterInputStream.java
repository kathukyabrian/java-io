import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class NumberFilterInputStream extends FilterInputStream {
    protected NumberFilterInputStream(InputStream in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        return super.read();
    }
}

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class NumberFilterInputStream extends FilterInputStream {
    protected NumberFilterInputStream(InputStream in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        int b = super.read();

        if (b >= 48 && b <= 57) {
            return b;
        } else {
            return 63;
        }
    }
}

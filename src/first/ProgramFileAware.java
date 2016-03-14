package first;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface ProgramFileAware {
    public void executeProgramFile(String file) throws IOException, ClassNotFoundException;
}

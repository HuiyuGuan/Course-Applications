import java.io.File;
import java.nio.file.Files;
import java.io.IOException;

public class BackupFileRotation {
  SchoolSystem schoolWriter = new SchoolSystem();

  public void rotate(File original, File backup1, File backup2, File backup3) throws IOException {
    if (original.exists()) {
      Files.copy(original.toPath(),backup3.toPath());
      original.renameTo(backup1);
    }

      if (backup3.length() >= backup2.length()) {
        Files.copy(original.toPath(),backup3.toPath());
        backup3.renameTo(backup1);
      }

      if (backup2.length() >= backup1.length()) {
        backup2.renameTo(original);
      }

      if (backup1.length() >= original.length()) {
        backup1.renameTo(original);
      }

  }

}

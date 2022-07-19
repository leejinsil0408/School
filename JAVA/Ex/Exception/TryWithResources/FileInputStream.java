package Exception.TryWithResources;

public class FileInputStream implements AutoCloseable {
    //p438 자동리소스닫기
        private String file;

        public FileInputStream(String file) {
            this.file = file;
        }

        public void read() {
            System.out.println(file + "을 읽습니다.");
        }

        @Override
        public void close() throws Exception {
            System.out.println(file + "을 닫습니다");
        }
    }


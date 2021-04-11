package composite.path.composite;

public class BuildDirectory {

    public static void main(String[] args) {
        Directory root = new Directory("root");

        Directory booksDirectory = new Directory("books");
        File coreJavaFile = new File("Java核心技术");
        File codeCompleteFile = new File("代码大全");
        booksDirectory.add(coreJavaFile);
        booksDirectory.add(codeCompleteFile);
        // books文件夹添加到根目录
        root.add(booksDirectory);

        Directory picturesDirectory = new Directory("pictures");
        File pictures1 = new File("照片1");
        File pictures2 = new File("照片2");
        File pictures3 = new File("照片3");
        picturesDirectory.add(pictures1);
        picturesDirectory.add(pictures2);
        picturesDirectory.add(pictures3);
        // 删除照片2
        picturesDirectory.remove(pictures2);
        // 把pictures文件夹添加到根目录
        root.add(picturesDirectory);

        Directory networkDirectory = new Directory("network");
        File computerNetworkingFile = new File("计算机网络：自顶向下方法");
        File tcpIpFile  = new File("TCP/IP详解");
        networkDirectory.add(computerNetworkingFile);
        networkDirectory.add(tcpIpFile);
        // 把network文件夹添加到books文件夹
        booksDirectory.add(networkDirectory);

        root.print(0);
    }
}

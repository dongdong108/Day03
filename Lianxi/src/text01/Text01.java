package text01;

import java.io.File;
import java.util.LinkedList;
/*
 * 遍历出一个文件夹下的所有文件，并展示出层级关系，文件夹优先显示，最后以一定格式写入文本中
    	要求：尽可能简单、逻辑清晰
           所选存储格式结构也能看出层级关系，并可读写后直接使用
 * */
public class Text01 implements Fu{
	
	public static void main(String[] args) {
		new Text01().traverseFolder1("d://就业指导");
	}
	
	public void traverseFolder1(String path) {
        int fileNum = 0, folderNum = 0;
        File file = new File(path);
        if (file.exists()) {
            LinkedList<File> list = new LinkedList<File>();
            File[] files = file.listFiles();
            for (File file2 : files) {
                if (file2.isDirectory()) {
                    System.out.println("文件夹:" + file2.getAbsolutePath());
                    list.add(file2);
                    fileNum++;
                } else {
                    System.out.println("文件:" + file2.getAbsolutePath());
                    folderNum++;
                }
            }
            File temp_file;
            while (!list.isEmpty()) {
                temp_file = list.removeFirst();
                files = temp_file.listFiles();
                for (File file2 : files) {
                    if (file2.isDirectory()) {
                        System.out.println("文件夹:" + file2.getAbsolutePath());
                        list.add(file2);
                        fileNum++;
                    } else {
                        System.out.println("文件:" + file2.getAbsolutePath());
                        folderNum++;
                    }
                }
            }
        } else {
            System.out.println("文件不存在!");
        }
        System.out.println("文件共有:" + folderNum + ",文件夹共有:" + fileNum);

    }


}

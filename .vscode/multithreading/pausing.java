class downloadFile extends Thread{
    String filename;
    public downloadFile(String filename){
        this.filename=filename;
    }
    public void run(){
        for(int i=1;i<=5;i++)
        {
            System.out.println(filename + " "+ " with thread downloading....."+(i*20)+"%");
        
        try{
            Thread.sleep(100);
        }
        catch(Exception e){}
    }
    System.out.println(filename+ " was downloaded");
        }
    }


class FileDownload{
    public void download(String file){
        for(int i=1;i<=5;i++)
        {
            System.out.println(file + " "+ "downloading....."+(i*20)+"%");
        
        try{
            Thread.sleep(100);
        }
        catch(Exception e){}
    }
    System.out.println(file+ " was downloaded");
    }
}

public class pausing {
    public static void main(String[] args) {
        FileDownload obj = new FileDownload();
        obj.download("file A");
        obj.download("file B");



        ///////////////////
        /// 
        /// 
        downloadFile t3 = new downloadFile("file c");
        downloadFile t4 = new downloadFile("file d");
        t3.start();
        t4.start();
    }
    
}

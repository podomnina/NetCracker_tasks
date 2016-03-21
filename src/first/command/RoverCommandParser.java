package first.command;

import first.Rover;

import java.io.*;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RoverCommandParser {
    private LinkedList<RoverCommand> comList;
    private Iterator<RoverCommand> iterator;
    private String file;
    private Rover rover;

    public RoverCommand readNextCommand(){
        return iterator.next();
    }
    public void setFile(String file){
        this.file=file;
    }

    public boolean checkEndOfList(){
        return (iterator.hasNext()) ? true : false;
    }
    public LinkedList<RoverCommand> readFile(String file){
        LinkedList<RoverCommand> list=new LinkedList<>();
        String pattern1="(.+)\\((\\d+),(\\d+)\\);";
        String pattern2="(.+)\\((.+)\\);";
        String pattern3="^import (.+);$";
        try{
            BufferedReader in = new BufferedReader(new FileReader(file));
            String command;
            LoggingCommand loggingCommand;
            do {
                command=in.readLine();
                if (command!=null) {
                    Pattern p = Pattern.compile(pattern1);
                    Matcher m = p.matcher(command);
                    if (m.find()) {
                        loggingCommand =new LoggingCommand(new MoveCommand(rover,Integer.parseInt(m.group(2)),Integer.parseInt(m.group(3))));
                        list.add(loggingCommand);
                    }
                    else {
                        p=Pattern.compile(pattern2);
                        m=p.matcher(command);
                        if (m.find()) {
                            loggingCommand = new LoggingCommand(new TurnCommand(rover, m.group(2)));
                            list.add(loggingCommand);
                        }
                        else {
                            p=Pattern.compile(pattern3);
                            m=p.matcher(command);
                            if (m.find()){
                                LinkedList<RoverCommand> newList = readFile(m.group(1));
                                ImportCommand imp = new ImportCommand(list);
                                imp.addCollection(newList);
                            }
                        }
                    }
                }
            }while (command!=null);
            in.close();
        } catch (FileNotFoundException e){
            System.out.println("File not found!");
        } catch (IOException e){
            System.out.println("Error!");
        }


        return list;
    }
    public RoverCommandParser(Rover rover) throws IOException, ClassNotFoundException{
        this.rover=rover;
    }
    public void Read(){
        comList=readFile(file);
        iterator=comList.iterator();
    }
}

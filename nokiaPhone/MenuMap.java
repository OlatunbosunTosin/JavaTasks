import java.util.Scanner;
public class MenuMap{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        while(true){
        System.out.print(String.format("""
                                        1. Phonebook
                                        2. Messages
                                        3. Chat
                                        4. Call register
                                        5. Set tones
                                        6. Settings
                                        7. Call divert
                                        8. Games
                                        9. Calculator
                                        10. Reminders
                                        11. Clock
                                        12. Profiles
                                        13. SIM services 
                                         0.back \n"""
));

        int menu = input.nextInt();       
        if(menu == 0){
            break;
        }
        switch(menu){
        case 1: System.out.print("Phone book\n");

                while(true){
                System.out.print(String.format("""
                                                  1. Search
                                                  2. Service Nos.
                                                  3. Add name
                                                  4. Erase
                                                  5. Edit
                                                  6. Assign tone
                                                  7. Send b’card
                                                  8. Options
                                                  9. Speed dials
                                                 10. Voice tags 
                                                  0.back \n"""
));
                int phoneBook = input.nextInt(); 
                if(phoneBook == 0){
                    break;
                }
                switch(phoneBook){
                case 1: System.out.print("Search\n");
                        break;
               
                case 2: System.out.print("Service Nos.\n");
                        break;

                case 3: System.out.print("Add name\n");
                        break;
                
                case 4: System.out.print("Erase\n");
                        break;
                
                case 5: System.out.print("Edit\n");
                        break;
                
                case 6: System.out.print("Assign tone\n");
                        break;
                
                case 7: System.out.print("Send b’card\n");
                        break;
                
                case 8: System.out.print("Options\n");
                        
                        while(true){
                        System.out.print(String.format("""
                                             1. Type of view
                                             2. Memory status 
                                             0. back \n"""
));
                        int options = input.nextInt(); 
                        if(options == 0){
                            break;
                        }
                        switch(options){
                        case 1: System.out.print("Type of view\n");
                                break;

                        case 2: System.out.print("Memory status\n");
                                break;

                        case 0: System.out.print("back\n");
                                break;

                        default: System.out.print("Invalid\n");
                        }}
                break;
                
                case 9: System.out.print("Speed dials");
                        break;
                
                case 10: System.out.print("Voice tags");
                         break;

                case 0: System.out.print("back\n");
                        break;

                default: System.out.print("Invalid\n");
                }}
        break;
        
        case 2: System.out.print("Messages\n");
                
                while(true){
                System.out.print(String.format("""
                                  1. Write messages
                                  2. Inbox
                                  3. Outbox
                                  4. Picture messages
                                  5. Templates
                                  6. Smileys
                                  7. Message settings
                                  8. Info service
                                  9. Voice mailbox number
                                  10. Service command editor 
                                   0. back      \n"""
));
                int messages = input.nextInt(); 
                
                if(messages == 0){
                    break;
                }
                switch(messages){
                case 1: System.out.print("Write messages\n");
                        break;
                
                case 2: System.out.print("Inbox\n");
                        break;
                
                case 3: System.out.print("Outbox\n");
                        break;
                
                case 4: System.out.print("Picture messages\n");
                        break;
                
                case 5: System.out.print("Templates\n");
                        break;
                
                case 6: System.out.print("Smileys\n");
                        break;
                
                case 7: System.out.print("Message settings\n");

                        while(true){
                        System.out.print(String.format("""
                                    1. Set
                                    2. Common \n"""
));
                        int messageSettings = input.nextInt(); 

                        if(messageSettings == 0){
                            break;
                        }
                        switch(messageSettings){
                        case 1: System.out.print("Set\n");

                                while(true){
                                System.out.print(String.format("""
                                       1. Message centre number
                                       2. Messages sent as
                                       3. Message validity \n"""
));
                                int set = input.nextInt();
                                
                                if(set == 0){
                                    break;
                                }
                                switch(set){
                                case 1: System.out.print("Message centre number\n");
                                        break;
                        
                                case 2: System.out.print(" Messages sent as\n");
                                        break;
                        
                                case 3: System.out.print("Message validity\n");
                                        break;

                                case 0: System.out.print("back\n");
                                        break;

                                default: System.out.print("Invalid");
                                          
                                }}
                        break;
                        case 2: System.out.print("Common\n");

                                while(true){
                                System.out.print(String.format("""
                                        1. Delivery reports
                                        2. Reply via same centre
                                        3. Character support \n"""
));
                                int common = input.nextInt();
                                
                                if(common == 0){
                                    break;
                                }
                                switch(common){
                                case 1: System.out.print("Delivery reports\n");
                                        break;
                        
                                case 2: System.out.print("Reply via same centre\n");
                                        break;
                        
                                case 3: System.out.print("Character support\n");
                                        break;

                                case 0: System.out.print("back\n");
                                        break;

                                default: System.out.print("Invalid");
                                         
                                }}
                        break;
                        case 0: System.out.print("back\n");
                                break;

                        default: System.out.print("Invalid");
                        }}
                break;

                case 8: System.out.print("Info service\n");
                        break;
        
                case 9: System.out.print("Voice mailbox number\n");
                        break;
                
                case 10: System.out.print("Service command editor\n");
                         break;
                
                case 0: System.out.print("back\n");
                         break;
                
                default: System.out.print("Invalid");
                        
                }}break;               

        case 3: System.out.print("Chats\n");
                break;

        case 4: System.out.print("Call register\n");
                
                while(true){
                System.out.print(String.format("""
                            1. Missed calls
                            2. Received calls
                            3. Dialled numbers
                            4. Erase recent call lists
                            5. Show call duration
                            6. Show call costs
                            7. Call cost settings
                            8. Prepaid credit \n"""
));
                int callRegister = input.nextInt(); 

                if(callRegister == 0){
                    break;
                }
                switch(callRegister){
                case 1: System.out.print("Missed calls\n");
                        break;
                
                case 2: System.out.print("Received calls\n");
                        break;
                
                case 3: System.out.print("Dialled numbers\n");
                        break;
                
                case 4: System.out.print("Erase recent call lists\n");
                        break;
                
                case 5: System.out.print("Show call duration\n");

                        while(true){
                        System.out.print(String.format("""
                                    1. Last call duration
                                    2. All calls’ duration
                                    3. Received calls’ duration
                                    4. Dialled calls’ duration
                                    5. Clear timers  \n"""
));
                        int showCallDuration = input.nextInt();

                        if(showCallDuration == 0){
                            break;
                        } 
                        switch(showCallDuration){
                        case 1: System.out.print("Last call duration\n");
                                break;
                        
                        case 2: System.out.print("All calls’ duration\n");
                                break;
                        
                        case 3: System.out.print("Received calls’ duration\n");
                                break;
                        
                        case 4: System.out.print("Dialled calls’ duration\n");
                                break;
                        
                        case 5: System.out.print("Clear timers\n");
                                break;
                        
                        default: System.out.print("Invalid\n");
                        }}
                break;
                        
                case 6: System.out.print("Show call costs\n");

                        while(true){
                        System.out.print(String.format("""
                                1. Last call cost
                                2. All calls’ cost
                                3. Clear counters \n"""
));
                        int showCallCosts = input.nextInt(); 

                        if (showCallCosts == 0){
                            break;
                        }
                        switch(showCallCosts){
                        case 1: System.out.print("Last call cost\n");
                                break;
                        
                        case 2: System.out.print("All calls’ cost\n");
                                break;
                        
                        case 3: System.out.print("Clear counters\n");
                                break;

                        case 0: System.out.print("Clear counters\n");
                                break;

                        default: System.out.print("Invalid\n");
                        }}
                break;

                case 7: System.out.print("Call cost settings");

                        while(true){
                        System.out.print(String.format("""
                                        1. Call cost limit
                                        2. Show costs in \n"""
));
                        int callCostSettings = input.nextInt(); 
                        
                        if(callCostSettings == 0){
                            break;
                        }
                        switch(callCostSettings){
                        case 1: System.out.print("Call cost limit\n");
                                break;
                        
                        case 2: System.out.print("Show costs in\n");
                                break;

                        case 0: System.out.print("back\n");
                                break;

                        default: System.out.print("Invalid\n");
                        }}
                break;

                case 8: System.out.print("Prepaid credit\n");
                        break;
                
                case 0: System.out.print("back\n");
                        break;

                default: System.out.print("Invalid");
                         
                }}
                break;

        case 5: System.out.print("Tones\n");

                while(true){
                System.out.print(String.format("""
                                1. Ringing tone
                                2. Ringing volume
                                3. Incoming call alert
                                4. Composer
                                5. Message alert tone
                                6. Keypad tones
                                7. Warning and game tones
                                8. Vibrating alert
                                9. Screen saver \n"""
));
                int tones = input.nextInt(); 

                if(tones == 0){
                    break;
                }
                switch(tones){
                case 1: System.out.print("Ringing tone\n");
                        break;
                
                case 2: System.out.print("Ringing volume\n");
                        break;
                
                case 3: System.out.print("Incoming call alert\n");
                        break;
                
                case 4: System.out.print("Composer\n");
                        break;
                
                case 5: System.out.print("Message alert tone\n");
                        break;
                
                case 6: System.out.print("Assign tone\n");
                        break;
                
                case 7: System.out.print("Warning and game tones\n");
                        break;
                
                case 8: System.out.print("Vibrating alert\n");
                        break;
                
                case 9: System.out.print("Screen saver\n");
                        break;

                case 0: System.out.print("back\n");
                        break;
                
                default: System.out.print("Invalid");       
                }}
        break;

        case 6: System.out.print("Settings\n");

                while(true){
                System.out.print(String.format("""
                            1. Call settings
                            2. Phone settings
                            3. Security settings
                            4. Restore factory settings \n"""
));
                int settings = input.nextInt(); 

                if(settings == 0){ 
                    break; 
                }
                switch(settings){
                case 1: System.out.print("Call settings\n");

                        while(true){
                        System.out.print(String.format("""
                            1. Automatic redial
                            2. Speed dialling
                            3. Call waiting options
                            4. Own number sending
                            5. Phone line in use
                            6. Automatic answer  \n"""
));
                        int callSettings = input.nextInt(); 

                        if(callSettings == 0){
                            break;
                        }
                        switch(callSettings){
                        case 1: System.out.print("Automatic redial\n");
                                break;
                        
                        case 2: System.out.print("Speed dialling\n");
                                break;
                        
                        case 3: System.out.print("Call waiting options\n");
                                break;
                        
                        case 4: System.out.print("Own number sending\n");
                                break;
                        
                        case 5: System.out.print("Phone line in use\n");
                                break;
                        
                        case 6: System.out.print("Phone Automatic answer\n");
                                break;

                        case 0: System.out.print("back\n");
                                break;

                        default: System.out.print("Invalid\n");
                        }}
                break;

                case 2: System.out.print("Phone settings\n");

                        while(true){
                        System.out.print(String.format("""
                            1. Language
                            2. Cell info display
                            3. Welcome note
                            4. Network selection
                            5. Lights2
                            6. Confirm SIM service actions  \n """
));
                        int phoneSettings = input.nextInt(); 

                        if(phoneSettings == 0){
                            break;
                        }
                        switch(phoneSettings){
                        case 1: System.out.print("Language\n");
                                break;
                        
                        case 2: System.out.print("Cell info display\n");
                                break;
                        
                        case 3: System.out.print("Welcome note\n");
                                break;
                        
                        case 4: System.out.print("Network selection\n");
                                break;
                        
                        case 5: System.out.print("Lights\n");
                                break;
                        
                        case 6: System.out.print("Confirm SIM service actions\n");
                                break;

                        case 0: System.out.print("back\n");
                                break;
                        }}
                break;

                case 3: System.out.print("Security settings\n");

                        while(true){
                        System.out.print(String.format("""
                            1. PIN code request
                            2. Call barring service
                            3. Fixed dialling
                            4. Closed user group
                            5. Phone security
                            6. Change access codes \n"""                   
));
                        int securitySettings = input.nextInt(); 

                        if(securitySettings == 0){
                            break;
                        }
                        switch(securitySettings){
                        case 1: System.out.print("PIN code request\n");
                                break;
                        
                        case 2: System.out.print("Call barring service\n");
                                break;
                        
                        case 3: System.out.print("Fixed dialling\n");
                                break;
                        
                        case 4: System.out.print("Closed user group\n");
                                break;
                        
                        case 5: System.out.print("Phone security\n");
                                break;
                        
                        case 6: System.out.print("Change access codes\n");
                                break;
                        }}
                
                break;

                case 4: System.out.print("Restore factory settings\n");
                        break;

                case 0: System.out.print("back\n");
                        break;
                
                default: System.out.print("Invalid\n");
                }}
        break;

        case 7: System.out.print("Call divert\n");
                break;

        case 8: System.out.print("Games\n");
                break;

        case 9: System.out.print("Calculator\n");
                break;

        case 10: System.out.print("Reminders\n");
                 break;

        case 11: System.out.print("Clock\n");

                 while(true){
                 System.out.print(String.format("""
                            1. Alarm clock
                            2. Clock settings
                            3. Date setting
                            4. Stopwatch
                            5. Countdown timer
                            6. Auto update of date and time \n """
));
                 int clock = input.nextInt(); 

                 if(clock == 0){
                     break;
                 }
                 switch(clock){
                 case 1: System.out.print("Alarm clock\n");
                         break;
                 
                 case 2: System.out.print("Clock settings\n");
                         break;
                 
                 case 3: System.out.print("Date setting\n");
                         break;
                 
                 case 4: System.out.print("Stopwatch\n");
                         break;
                 
                 case 5: System.out.print("Countdown timer\n");
                         break;
                 
                 case 6: System.out.print("Auto update of date and time\n");
                         break;
                 
                 default: System.out.print("Invalid\n");
                          break;
                 }}
        break;

        case 12: System.out.print("Profiles\n");
                 break;

        case 13: System.out.print("SIM services\n");
                 break;
        case 0:  System.out.println("back\n");
                 break;
        
        default: System.out.print("Invalid\n");
               
        }
     }
        
    }
}

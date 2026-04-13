import java.util.Scanner;
public class MenuMap{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Choose 1 for phonebook\nChoose 2 for messages\nChoose 3 to chat\nChoose 4 for call register\nChoose 5 to set tones\nChoose 6 for settings\nChoose 7 for call divert\nChoose 8 for games\nChoose 9 for calculator\nChoose 10 for reminders\nChoose 11 for clock\nChoose 12 for profiles\nChoose 13 for SIM services: ");
        int menu = input.nextInt();       
        
        switch(menu){
        case 1: System.out.print("Phone book\n");


                System.out.print("Choose 1 for Search\nChoose 2 for Service Nos.\nChoose 3 to Add name\nChoose 4 for Erase\nChoose 5 to Edit\nChoose 6 for Assign tone\nChoose 7 for Send b’card\nChoose 8 for Options\nChoose 9 for Speed dials\nChoose 10 for Voice tags: ");
                int subMenu = input.nextInt(); 
                
                if (subMenu == 1){
                    System.out.print("Search\n");
                    break;
                }
                if (subMenu == 2){
                    System.out.print("Service Nos.\n");
                    break;
                }
                if (subMenu == 3){
                    System.out.print("Add name\n");
                    break;
                }
                if (subMenu == 4){
                    System.out.print("Erase\n");
                    break;
                }
                if (subMenu == 5){
                    System.out.print("Edit\n");
                    break;
                }
                if (subMenu == 6){
                    System.out.print("Assign tone\n");
                    break;
                }
                if (subMenu == 7){
                    System.out.print("Send b’card\n");
                    break;
                }
                if (subMenu == 8){
                    System.out.print("Options\n");
                    System.out.print("Choose 1 for Type of view\nChoose 2 for Memory status: ");
                    int subSubMenu = input.nextInt(); 
                    if (subSubMenu == 1){
                        System.out.print("Type of view\n");
                        break;
                    }
                    if (subSubMenu == 2){
                        System.out.print("Memory status\n");
                        break;
                    }
                }
                if (subMenu == 9){
                    System.out.print("Speed dials");
                    break;
                }
                if (subMenu == 10){
                    System.out.print("Voice tags");
                    break;
                }

        case 2: System.out.print("Messages\n");

                System.out.print("Choose 1 for Write messages\nChoose 2 for Inbox\nChoose 3 to Outbox\nChoose 4 for Picture messages\nChoose 5 to Templates\nChoose 6 for Smileys\nChoose 7 for Message settings\nChoose 8 for Info service\nChoose 9 for Voice mailbox number\nChoose 10 for Service command editor: ");
                subMenu = input.nextInt(); 

                if (subMenu == 1){
                    System.out.print("Write messages\n");
                    break;
                }
                if (subMenu == 2){
                    System.out.print("Inbox\n");
                    break;
                }
                if (subMenu == 3){
                    System.out.print("Outbox\n");
                    break;
                }
                if (subMenu == 4){
                    System.out.print("Picture messages\n");
                    break;
                }
                if (subMenu == 5){
                    System.out.print("Templates\n");
                    break;
                }
                if (subMenu == 6){
                    System.out.print("Smileys\n");
                    break;
                }
                if (subMenu == 7){
                    System.out.print("Message settings\n");
                    System.out.print("Choose 1 for Set\nChoose 2 for Common\n: ");
                    int subSubMenu = input.nextInt(); 
                    if (subSubMenu == 1){
                        System.out.print("Set\n");
                        System.out.print("Choose 1 for Message centre number\nChoose 2 for Messages sent as\nChoose 3 for Message validity: ");
                        int subSubSubMenu = input.nextInt();
                        if (subSubSubMenu == 1){
                            System.out.print("Message centre number\n");
                            break;
                        }
                        if (subSubSubMenu == 2){
                            System.out.print(" Messages sent as\n");
                            break;
                        }
                        if (subSubSubMenu == 1){
                            System.out.print("Message validity\n");
                            break;
                        }
                    }
              
                    if (subSubMenu == 2){
                        System.out.print("Common\n");
                        System.out.print("Choose 1 for Delivery reports\nChoose 2 for Reply via same centre\nChoose 3 for Character support: ");
                        int subSubSubMenu = input.nextInt();
                        if (subSubSubMenu == 1){
                            System.out.print("Delivery reports\n");
                            break;
                        }
                        if (subSubSubMenu == 2){
                            System.out.print("Reply via same centre\n");
                            break;
                        }
                        if (subSubSubMenu == 1){
                            System.out.print("Character support\n");
                            break;
                        }
                    }
                }
                if (subMenu == 8){
                    System.out.print("Info service\n");

                }
                if (subMenu == 9){
                    System.out.print("Voice mailbox number\n");
                    break;
                }
                if (subMenu == 10){
                    System.out.print("Service command editor\n");
                    break;
                }

        case 3: System.out.print("Chats\n");
                break;

        case 4: System.out.print("Call register\n");

                System.out.print("Choose 1 for Missed calls\nChoose 2 for Received calls\nChoose 3 for Dialled numbers\nChoose 4 for Erase recent call lists\nChoose 5 to Show call duration\nChoose 6 to Show call costs\nChoose 7 for Call cost settings\nChoose 8 for Prepaid credit: ");
                subMenu = input.nextInt(); 

                if (subMenu == 1){
                    System.out.print("Missed calls\n");
                    break;
                }
                if (subMenu == 2){
                    System.out.print("Received calls\n");
                    break;
                }
                if (subMenu == 3){
                    System.out.print("Dialled numbers\n");
                    break;
                }
                if (subMenu == 4){
                    System.out.print("Erase recent call lists\n");
                    break;
                }
                if (subMenu == 5){
                    System.out.print("Show call duration\n");
                    System.out.print("Choose 1 for Last call duration\nChoose 2 for All calls’ duration\nChoose 3 for Received calls’ duration\nChoose 4 for Dialled calls’ duration\nChoose 5 to Clear timers: ");
                    int subSubMenu = input.nextInt(); 
                    if (subSubMenu == 1){
                        System.out.print("Last call duration\n");
                        break;
                    }
                    if (subSubMenu == 2){
                        System.out.print("All calls’ duration\n");
                        break;
                    }
                    if (subSubMenu == 3){
                        System.out.print("Received calls’ duration\n");
                        break;
                    }
                    if (subSubMenu == 4){
                        System.out.print("Dialled calls’ duration\n");
                        break;
                    }
                    if (subSubMenu == 5){
                        System.out.print("Clear timers\n");
                        break;
                    }
                }
                        
                if (subMenu == 6){
                    System.out.print("Show call costs\n");
                    System.out.print("Choose 1 for Last call cost\nChoose 2 for All calls’ cost\nChoose 3 for Clear counters: ");
                    int subSubMenu = input.nextInt(); 
                    if (subSubMenu == 1){
                        System.out.print("Last call cost\n");
                        break;
                    }
                    if (subSubMenu == 2){
                        System.out.print("All calls’ cost\n");
                        break;
                    }
                    if (subSubMenu == 3){
                        System.out.print("Clear counters\n");
                        break;
                    }
                }
                if (subMenu == 7){
                    System.out.print("Call cost settings");
                    System.out.print("Choose 1 for Call cost limit\nChoose 2 for Show costs in: ");
                    int subSubMenu = input.nextInt(); 
                    if (subSubMenu == 1){
                        System.out.print("Call cost limit\n");
                        break;
                    }
                    if (subSubMenu == 2){
                        System.out.print("Show costs in\n");
                        break;
                    }
              
                }
                if (subMenu == 8){
                    System.out.print("Prepaid credit\n");
                    break;
                }

        case 5: System.out.print("Tones\n");

                System.out.print("Choose 1 for Ringing tone\nChoose 2 for Ringing volume\nChoose 3 for Incoming call alert\nChoose 4 for Composer\nChoose 5 for Message alert tone\nChoose 6 for Keypad tones\nChoose 7 for Warning and game tones\nChoose 8 for Vibrating alert\nChoose 9 for Screen saver: ");
                subMenu = input.nextInt(); 

                if (subMenu == 1){
                    System.out.print("Ringing tone\n");
                    break;
                }
                if (subMenu == 2){
                    System.out.print("Ringing volume\n");
                    break;
                }
                if (subMenu == 3){
                    System.out.print("Incoming call alert\n");
                    break;
                }
                if (subMenu == 4){
                    System.out.print("Composer\n");
                    break;
                }
                if (subMenu == 5){
                    System.out.print("Message alert tone\n");
                    break;
                }
                if (subMenu == 6){
                    System.out.print("Assign tone\n");
                    break;
                }
                if (subMenu == 7){
                    System.out.print("Warning and game tones\n");
                    break;
                }
                if (subMenu == 8){
                    System.out.print("Vibrating alert\n");
                    break;
                }
                if (subMenu == 9){
                    System.out.print("Screen saver\n");
                    break;
                }

        case 6: System.out.print("Settings\n");

                System.out.print("Choose 1 for Call settings\nChoose 2 for Phone settings\nChoose 3 for Security settings\nChoose 4 for Restore factory settings: ");
                subMenu = input.nextInt(); 

                if (subMenu == 1){
                    System.out.print("Call settings\n");
System.out.print("Choose 1 for Automatic redial\nChoose 2 for Speed dialling\nChoose 3 for Call waiting options\nChoose 4 for Own number sending\nChoose 5 for Phone line in use\nChoose 6 for Automatic answer: ");
                    int subSubMenu = input.nextInt(); 
                    if (subSubMenu == 1){
                        System.out.print("Automatic redial\n");
                        break;
                    }
                    if (subSubMenu == 2){
                        System.out.print("Speed dialling\n");
                        break;
                    }
                    if (subSubMenu == 3){
                        System.out.print("Call waiting options\n");
                        break;
                    }
                    if (subSubMenu == 4){
                        System.out.print("Own number sending\n");
                        break;
                    }
                    if (subSubMenu == 5){
                        System.out.print("Phone line in use\n");
                        break;
                    }
                    if (subSubMenu == 6){
                        System.out.print("Phone Automatic answer\n");
                        break;
                    }
                    
                }

                if (subMenu == 2){
                    System.out.print("Phone settings\n");
System.out.print("Choose 1 for Language\nChoose 2 for Cell info display\nChoose 3 for Welcome note\nChoose 4 for Network selection\nChoose 5 for Lights\nChoose 6 to Confirm SIM service actions: ");
                    int subSubMenu = input.nextInt(); 
                    if (subSubMenu == 1){
                        System.out.print("Language\n");
                        break;
                    }
                    if (subSubMenu == 2){
                        System.out.print("Cell info display\n");
                        break;
                    }
                    if (subSubMenu == 3){
                        System.out.print("Welcome note\n");
                        break;
                    }
                    if (subSubMenu == 4){
                        System.out.print("Network selection\n");
                        break;
                    }
                    if (subSubMenu == 5){
                        System.out.print("Lights\n");
                        break;
                    }
                    if (subSubMenu == 6){
                        System.out.print("Confirm SIM service actions\n");
                        break;
                    }
                    
                }
                        
                if (subMenu == 3){
                    System.out.print("Security settings\n");
System.out.print("Choose 1 for PIN code request\nChoose 2 for Call barring service\nChoose 3 for Fixed dialling\nChoose 4 for Closed user group\nChoose 5 for Phone security\nChoose 6 to Change access codes: ");
                    int subSubMenu = input.nextInt(); 
                    if (subSubMenu == 1){
                        System.out.print("PIN code request\n");
                        break;
                    }
                    if (subSubMenu == 2){
                        System.out.print("Call barring service\n");
                        break;
                    }
                    if (subSubMenu == 3){
                        System.out.print("Fixed dialling\n");
                        break;
                    }
                    if (subSubMenu == 4){
                        System.out.print("Closed user group\n");
                        break;
                    }
                    if (subSubMenu == 5){
                        System.out.print("Phone security\n");
                        break;
                    }
                    if (subSubMenu == 6){
                        System.out.print("Change access codes\n");
                        break;
                    }
                }

                if (subMenu == 4){
                    System.out.print("Restore factory settings");
                    break;
                }

        case 7: System.out.print("Call divert\n");
                break;

        case 8: System.out.print("Games\n");
                break;

        case 9: System.out.print("Calculator\n");
                break;

        case 10: System.out.print("Reminders\n");
                 break;

        case 11: System.out.print("Clock\n");

                 System.out.print("Choose 1 for Alarm clock\nChoose 2 for Clock settings\nChoose 3 for Date setting\nChoose 4 for Stopwatch\nChoose 5 for Countdown timer\nChoose 6 for Auto update of date and time: ");
                subMenu = input.nextInt(); 

                 if (subMenu == 1){
                    System.out.print("Alarm clock\n");
                    break;
                 }
                 if (subMenu == 2){
                    System.out.print("Clock settings\n");
                    break;
                 }
                 if (subMenu == 3){
                    System.out.print("Date setting\n");
                    break;
                 }
                 if (subMenu == 4){
                    System.out.print("Stopwatch\n");
                    break;
                 }
                 if (subMenu == 5){
                    System.out.print("Countdown timer\n");
                    break;
                 }
                 if (subMenu == 5){
                    System.out.print("Auto update of date and time\n");
                    break;
                 }

        case 12: System.out.print("Profiles\n");
                break;

        case 13: System.out.print("SIM services\n");
                break;
              
        default: System.out.print("Invalid\n");
               
        }
    }
}

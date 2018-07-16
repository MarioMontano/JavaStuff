/**
 * Client for the MountSobo class
 *
 * Mario Montano
 */
import java.util.Scanner;

public class MountSoboClient
{
    public static void main( String [ ] args )
    {
        // instantiate the populatedheights array
        
        MountSobo inhabitedHeights = new MountSobo( );
        
        // prompt for the traveler's current height
        Scanner scan = new Scanner( System.in );
        System.out.print( "Enter traveler's height up the mountain "
                                  + "or 0 to stop > " );
        int searchHeight = scan.nextInt( );
        
        while ( searchHeight != 0 )
        {
            // determine whether height contains fauna
            System.out.println( inhabitedHeights.getFauna( searchHeight ) );
            
            System.out.print( "\nEnter the next traveler's height up the mountain "
                                       + "or 0 to stop > " );
            searchHeight = scan.nextInt( );
        }
        
        System.out.println( "\nThe heights with fauna were "
                                    + inhabitedHeights.toString( ) );
    }
}

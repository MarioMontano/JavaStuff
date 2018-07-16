import java.util.Random;

public class MountSobo
{
    // array to hold appearance of fauna at random height
    private int [ ] populatedheights;
    // parallel array that holds fauna
    private String [ ] fauna = { "Japanese serow",
                                 "Asian black bear",
                                 "Japanese dormice",
                                 "Sika deer",
                                 "Human" };
    /** Default constructor instantiates height array
     *  and randomly generates height where found
     */
    public MountSobo( )
    {
        populatedheights = new int [fauna.length];
        fillPopulatedheights( ); // generate heights where fauna found
    }

    /** Utility method generates heights where fauna are found
     *  and stores them in the populatedheights array
     */
    private void fillPopulatedheights( )
    {
        Random rand = new Random( );
        for ( int i = 0; i < populatedheights.length; i++ )
        {
            populatedheights[i] = rand.nextInt( 1756 ) + 1;
        }
    }

    /** Calls indexOfHeight with the traveler's climbed height
     * then translates return value into the fauna found
     * @param travelerHeight value to find
     * @return fauna
     */
    public String getFauna( int travelerHeight )
    {
        int faunaIndex = indexOfHeight( travelerHeight );
        if ( faunaIndex == -1 )
            return "Bummer, this height contains no fauna.";
        else
            return "You have found a " + fauna[faunaIndex];
    }

    /** Performs sequential search of populated heights array
     * @param traveler's height to find in inhabited height array
     * @return index of traveler's height if found, -1 if not found
     */
    private int indexOfHeight( int travelerheight )
    {
        for ( int i = 0; i < populatedheights.length; i++ )
        {
            if ( populatedheights[i] == travelerheight )
                return i;
        }
        return -1;
    }

    /** Returns printable version of MountSobo object
    * @return heights where fauna found separated by a tab
    */
    public String toString( )
    {
        String returnValue = "";
        for ( int i = 0; i < populatedheights.length; i++ )
        {
            returnValue += populatedheights[i] + "\t";
        }
        return returnValue;
    }
}

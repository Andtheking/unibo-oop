class Train {
    int nTotSeats;
    int nFirstClassSeats;
    int nSecondClassSeats;
    int nFirstClassReservedSeats;
    int nSecondClassReservedSeats;
    
    void build(int nTotSeats, int nFirstClassSeats, int nSecondClassSeats) {
        this.nTotSeats = nTotSeats;
        this.nFirstClassSeats = nFirstClassSeats;
        this.nSecondClassSeats = nSecondClassSeats;
        this.nFirstClassReservedSeats = 0;
        this.nSecondClassReservedSeats = 0;
    } 

    void reserveFirstClassSeats(int nToReserve){
        this.nFirstClassReservedSeats += nToReserve;
    } 

    void reserveSecondClassSeats(int nToReserve){
        this.nSecondClassReservedSeats += nToReserve;
    }

    double getTotOccupancyRatio(){
        // double ratio = ;
        return (this.nFirstClassReservedSeats + this.nSecondClassReservedSeats) * 100 / this.nTotSeats ;
    }

    double getFirstClassOccupancyRatio(){
        double ratio = this.nFirstClassReservedSeats;
        return ratio / this.nFirstClassSeats * 100;
    } 

    void deleteAllReservations(){
        this.nFirstClassReservedSeats = 0;
        this.nSecondClassReservedSeats = 0;
    } 

} 
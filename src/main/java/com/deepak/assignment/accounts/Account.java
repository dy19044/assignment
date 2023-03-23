package com.deepak.assignment.accounts;

public class Account implements OnlineAccount, Comparable<Account> {
     int noOfRegularMovies;
     int noOfExclusiveMovies;
     String ownerName;

    public Account(int noOfRegularMovies, int noOfExclusiveMovies, String ownerName){
        this.noOfRegularMovies = noOfRegularMovies;
        this.noOfExclusiveMovies = noOfExclusiveMovies;
        this.ownerName = ownerName;
    }

    public int monthlyCost() {
        return basePrice + noOfRegularMovies * regularMoviePrice + noOfExclusiveMovies * exclusiveMoviePrice;
    }

    public int compareTo(Account other) {
        return Integer.compare(this.monthlyCost(), other.monthlyCost());
    }

    @Override
    public String toString() {
        return "Owner is " + ownerName + " and monthly cost is " + monthlyCost() + " USD.";
    }
}

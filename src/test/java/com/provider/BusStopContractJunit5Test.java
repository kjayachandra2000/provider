package com.provider;

import au.com.dius.pact.provider.junitsupport.State;

public class BusStopContractJunit5Test extends BaseProviderTest {

    @State("There is a bus with number 613 arriving to Hammersmith bus station")
    public void toDefaultState() {
    }

    @State("There is 613 arriving to Hammersmith bus station")
    public void toDefaultNNState() {
    }
}
package com.PackageTests.stepdefinitions;

import com.PackageCode.pages.SamplePageObjectModel;

public class BaseSteps {

    static SamplePageObjectModel samplepage;

    static
    {
        samplepage = new SamplePageObjectModel();
    }


}

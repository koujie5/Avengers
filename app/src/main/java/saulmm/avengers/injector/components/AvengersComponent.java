/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package saulmm.avengers.injector.components;

import android.content.Context;

import dagger.Component;
import saulmm.avengers.injector.Activity;
import saulmm.avengers.injector.modules.ActivityModule;
import saulmm.avengers.views.activities.CharacterListListActivity;

@Activity
@Component(dependencies = AppComponent.class, modules = {ActivityModule.class})
public interface AvengersComponent extends ActivityComponent {
    void inject (CharacterListListActivity activity);

    Context activityContext();
}

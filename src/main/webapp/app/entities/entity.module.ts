import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';

import { AgdeRegionMySuffixModule } from './region-my-suffix/region-my-suffix.module';
import { AgdeCountryMySuffixModule } from './country-my-suffix/country-my-suffix.module';
import { AgdeLocationMySuffixModule } from './location-my-suffix/location-my-suffix.module';
import { AgdeDepartmentMySuffixModule } from './department-my-suffix/department-my-suffix.module';
import { AgdeTaskMySuffixModule } from './task-my-suffix/task-my-suffix.module';
import { AgdeEmployeeMySuffixModule } from './employee-my-suffix/employee-my-suffix.module';
import { AgdeJobMySuffixModule } from './job-my-suffix/job-my-suffix.module';
import { AgdeJobHistoryMySuffixModule } from './job-history-my-suffix/job-history-my-suffix.module';
/* jhipster-needle-add-entity-module-import - JHipster will add entity modules imports here */

@NgModule({
    imports: [
        AgdeRegionMySuffixModule,
        AgdeCountryMySuffixModule,
        AgdeLocationMySuffixModule,
        AgdeDepartmentMySuffixModule,
        AgdeTaskMySuffixModule,
        AgdeEmployeeMySuffixModule,
        AgdeJobMySuffixModule,
        AgdeJobHistoryMySuffixModule,
        /* jhipster-needle-add-entity-module - JHipster will add entity modules here */
    ],
    declarations: [],
    entryComponents: [],
    providers: [],
    schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class AgdeEntityModule {}

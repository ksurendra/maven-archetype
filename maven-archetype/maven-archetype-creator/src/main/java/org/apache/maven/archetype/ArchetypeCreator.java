package org.apache.maven.archetype;

/*
 * Copyright 2004-2006 The Apache Software Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import org.apache.maven.artifact.repository.ArtifactRepository;
import org.apache.maven.project.MavenProject;

import java.io.File;
import java.util.Properties;

/**
 * @author Jason van Zyl
 * @version $Revision:$
 */
public interface ArchetypeCreator
{
    static String ROLE = ArchetypeCreator.class.getName();

    File createArchetype( File basedir, ArtifactRepository localRepository, File targetDirectory,
                          Properties properties )
        throws ArchetypeCreationException;

    File createArchetype( MavenProject project, ArtifactRepository localRepository, File targetDirectory,
                          Properties properties )
        throws ArchetypeCreationException;
}

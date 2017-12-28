1. 将所有war项目打包后的WEB-INF/classes下文件打包为jar，放在最终的项目lib下。
	src/main/resources目录下的文件默认会打包到WEB-INF/classes目录下， 所以jar中会包含这些配置文件。 
	可将配置文件放在其它目录(如项目中src/main/config目录)， 打包时再将这些配置文件打包到WEB-INF/classes目录下
	 需要每个war项目的pom中配置以下內容：
	<plugin>
		<groupId>org.apache.maven.plugins</groupId>
		<artifactId>maven-war-plugin</artifactId>
		<configuration>
			<!-- 将打包后WEB-INF/classes目录文件封装成jar包放到WEB-INF/lib目录下； 每个war项目的pom中都需要配置该内容 -->
			<archiveClasses>true</archiveClasses>
			
			<webResources>
				<!-- 打包后， 将config目录下的资源文件放置在web-inf/classes目录中 -->
				<resource>
					<directory>src/main/config</directory>
					<targetPath>WEB-INF/classes</targetPath>
				</resource>
			</webResources>
		</configuration>
	</plugin>
2. 不同web项目的web资源，最好用定义不不同的目录中， 防止因最终放在主web目录中冲突， 而不确定最终留下那个web项目的资源

3. 需要将合并的其他web项目， 以依赖配置的方式配置到pom文件中。且需要添加war类型配置： <type>war</type>

4. 使用filter过滤资源


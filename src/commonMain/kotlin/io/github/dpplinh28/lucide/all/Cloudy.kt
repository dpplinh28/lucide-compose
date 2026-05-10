package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Cloudy") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(17.5f, 12f)
                arcToRelative(1f, 1f, 0f, true, true, 0f, 9f)
                horizontalLineTo(9.006f)
                arcToRelative(7f, 7f, 0f, true, true, 6.702f, -9f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(21.832f, 9f)
                arcTo(3f, 3f, 0f, false, false, 19f, 7f)
                horizontalLineToRelative(-2.207f)
                arcToRelative(5.5f, 5.5f, 0f, false, false, -10.72f, .61f)
            }
}

public val LucideIcons.All.CloudyDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Cloudy: ImageVector
    @Composable get() = CloudyDefinition.asImageVector()

package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Crown") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.562f, 3.266f)
                arcToRelative(.5f, .5f, 0f, false, true, .876f, 0f)
                lineTo(15.39f, 8.87f)
                arcToRelative(1f, 1f, 0f, false, false, 1.516f, .294f)
                lineTo(21.183f, 5.5f)
                arcToRelative(.5f, .5f, 0f, false, true, .798f, .519f)
                lineToRelative(-2.834f, 10.246f)
                arcToRelative(1f, 1f, 0f, false, true, -.956f, .734f)
                horizontalLineTo(5.81f)
                arcToRelative(1f, 1f, 0f, false, true, -.957f, -.734f)
                lineTo(2.02f, 6.02f)
                arcToRelative(.5f, .5f, 0f, false, true, .798f, -.519f)
                lineToRelative(4.276f, 3.664f)
                arcToRelative(1f, 1f, 0f, false, false, 1.516f, -.294f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(5f, 21f)
                horizontalLineToRelative(14f)
            }
}

public val LucideIcons.All.CrownDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Crown: ImageVector
    @Composable get() = CrownDefinition.asImageVector()

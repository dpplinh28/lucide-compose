package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MountainSnow") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(8f, 3f)
                lineToRelative(4f, 8f)
                lineToRelative(5f, -5f)
                lineToRelative(5f, 15f)
                horizontalLineTo(2f)
                lineTo(8f, 3f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(4.14f, 15.08f)
                curveToRelative(2.62f, -1.57f, 5.24f, -1.43f, 7.86f, .42f)
                curveToRelative(2.74f, 1.94f, 5.49f, 2f, 8.23f, .19f)
            }
}

public val LucideIcons.All.MountainSnowDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MountainSnow: ImageVector
    @Composable get() = MountainSnowDefinition.asImageVector()

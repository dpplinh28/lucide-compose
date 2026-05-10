package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Lamp") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 12f)
                verticalLineToRelative(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.077f, 10.615f)
                arcTo(1f, 1f, 0f, false, false, 5f, 12f)
                horizontalLineToRelative(14f)
                arcToRelative(1f, 1f, 0f, false, false, .923f, -1.385f)
                lineToRelative(-3.077f, -7.384f)
                arcTo(2f, 2f, 0f, false, false, 15f, 2f)
                horizontalLineTo(9f)
                arcToRelative(2f, 2f, 0f, false, false, -1.846f, 1.23f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 20f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(4f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineTo(9f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                close()
            }
}

public val LucideIcons.All.LampDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Lamp: ImageVector
    @Composable get() = LampDefinition.asImageVector()

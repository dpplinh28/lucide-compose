package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("LampFloor") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 10f)
                verticalLineToRelative(12f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.929f, 7.629f)
                arcTo(1f, 1f, 0f, false, true, 17f, 9f)
                horizontalLineTo(7f)
                arcToRelative(1f, 1f, 0f, false, true, -.928f, -1.371f)
                lineToRelative(2f, -5f)
                arcTo(1f, 1f, 0f, false, true, 9f, 2f)
                horizontalLineToRelative(6f)
                arcToRelative(1f, 1f, 0f, false, true, .928f, .629f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 22f)
                horizontalLineToRelative(6f)
            }
}

public val LucideIcons.All.LampFloorDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.LampFloor: ImageVector
    @Composable get() = LampFloorDefinition.asImageVector()

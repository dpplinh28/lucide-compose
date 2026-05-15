package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MonitorPlay") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.033f, 9.44f)
                arcToRelative(.647f, .647f, 0f, false, true, 0f, 1.12f)
                lineToRelative(-4.065f, 2.352f)
                arcToRelative(.645f, .645f, 0f, false, true, -.968f, -.56f)
                verticalLineTo(7.648f)
                arcToRelative(.645f, .645f, 0f, false, true, .967f, -.56f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 17f)
                verticalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 21f)
                horizontalLineToRelative(8f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f, 3.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, 2.0f, 0.0f)
                verticalLineToRelative(14.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, -2.0f, 0.0f)
                horizontalLineToRelative(-16.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, -2.0f, -0.0f)
                verticalLineToRelative(-14.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, 2.0f, -0.0f)
                close()
            }
}

public val LucideIcons.All.MonitorPlayDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MonitorPlay: ImageVector
    @Composable get() = MonitorPlayDefinition.asImageVector()

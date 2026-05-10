package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MonitorX") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(14.5f, 12.5f)
                lineToRelative(-5f, -5f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(9.5f, 12.5f)
                lineToRelative(5f, -5f)
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
            lucidePath(strokeWidth) {
                moveTo(12f, 17f)
                verticalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 21f)
                horizontalLineToRelative(8f)
            }
}

public val LucideIcons.All.MonitorXDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MonitorX: ImageVector
    @Composable get() = MonitorXDefinition.asImageVector()

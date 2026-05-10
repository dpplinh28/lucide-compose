package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Drill") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10f, 18f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineTo(5f)
                arcToRelative(3f, 3f, 0f, false, true, -3f, -3f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(13f, 10f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(9f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(6f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                lineToRelative(-.81f, 3.242f)
                arcToRelative(1f, 1f, 0f, false, true, -.97f, .758f)
                horizontalLineTo(8f)
            }
            lucidePath(strokeWidth) {
                moveTo(14f, 4f)
                horizontalLineToRelative(3f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineToRelative(-3f)
            }
            lucidePath(strokeWidth) {
                moveTo(18f, 6f)
                horizontalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(5f, 10f)
                lineToRelative(-2f, 8f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(7f, 18f)
                lineToRelative(2f, -8f)
            }
}

public val LucideIcons.All.DrillDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Drill: ImageVector
    @Composable get() = DrillDefinition.asImageVector()

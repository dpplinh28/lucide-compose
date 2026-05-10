package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("AlarmSmoke") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11f, 21f)
                curveToRelative(0f, -2.5f, 2f, -2.5f, 2f, -5f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 21f)
                curveToRelative(0f, -2.5f, 2f, -2.5f, 2f, -5f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(19f, 8f)
                lineToRelative(-.8f, 3f)
                arcToRelative(1.25f, 1.25f, 0f, false, true, -1.2f, 1f)
                horizontalLineTo(7f)
                arcToRelative(1.25f, 1.25f, 0f, false, true, -1.2f, -1f)
                lineTo(5f, 8f)
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 3f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(2f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineTo(4f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 21f)
                curveToRelative(0f, -2.5f, 2f, -2.5f, 2f, -5f)
            }
}

public val LucideIcons.All.AlarmSmokeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.AlarmSmoke: ImageVector
    @Composable get() = AlarmSmokeDefinition.asImageVector()

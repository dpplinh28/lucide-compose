package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Watch") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 10f)
                verticalLineToRelative(2.2f)
                lineToRelative(1.6f, 1f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(16.13f, 7.66f)
                lineToRelative(-.81f, -4.05f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -1.61f)
                horizontalLineToRelative(-2.68f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 1.61f)
                lineToRelative(-.78f, 4.05f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(7.88f, 16.36f)
                lineToRelative(.8f, 4f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 1.61f)
                horizontalLineToRelative(2.72f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -1.61f)
                lineToRelative(.81f, -4.05f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f, 12.0f)
                arcToRelative(6.0f, 6.0f, 0f, true, false, 12.0f, 0f)
                arcToRelative(6.0f, 6.0f, 0f, true, false, -12.0f, 0f)
            }
}

public val LucideIcons.All.WatchDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Watch: ImageVector
    @Composable get() = WatchDefinition.asImageVector()

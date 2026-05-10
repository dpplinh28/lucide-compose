package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("GlobeLock") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.686f, 15f)
                arcTo(14.5f, 14.5f, 0f, false, true, 12f, 22f)
                arcToRelative(14.5f, 14.5f, 0f, false, true, 0f, -20f)
                arcToRelative(10f, 10f, 0f, true, false, 9.542f, 13f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 12f)
                horizontalLineToRelative(8.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(20f, 6f)
                verticalLineTo(4f)
                arcToRelative(2f, 2f, 0f, true, false, -4f, 0f)
                verticalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f, 6.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, 1.0f, 0.0f)
                verticalLineToRelative(5.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, -1.0f, 0.0f)
                horizontalLineToRelative(-6.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, -1.0f, -0.0f)
                verticalLineToRelative(-5.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, 1.0f, -0.0f)
                close()
            }
}

public val LucideIcons.All.GlobeLockDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.GlobeLock: ImageVector
    @Composable get() = GlobeLockDefinition.asImageVector()

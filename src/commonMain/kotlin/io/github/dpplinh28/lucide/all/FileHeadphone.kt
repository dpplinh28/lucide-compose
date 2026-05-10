package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FileHeadphone") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4f, 6.835f)
                verticalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(8f)
                arcToRelative(2.4f, 2.4f, 0f, false, true, 1.706f, .706f)
                lineToRelative(3.588f, 3.588f)
                arcTo(2.4f, 2.4f, 0f, false, true, 20f, 8f)
                verticalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineToRelative(-.343f)
            }
            lucidePath(strokeWidth) {
                moveTo(14f, 2f)
                verticalLineToRelative(5f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(5f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 19f)
                arcToRelative(2f, 2f, 0f, false, true, 4f, 0f)
                verticalLineToRelative(1f)
                arcToRelative(2f, 2f, 0f, false, true, -4f, 0f)
                verticalLineToRelative(-4f)
                arcToRelative(6f, 6f, 0f, false, true, 12f, 0f)
                verticalLineToRelative(4f)
                arcToRelative(2f, 2f, 0f, false, true, -4f, 0f)
                verticalLineToRelative(-1f)
                arcToRelative(2f, 2f, 0f, false, true, 4f, 0f)
            }
}

public val LucideIcons.All.FileHeadphoneDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FileHeadphone: ImageVector
    @Composable get() = FileHeadphoneDefinition.asImageVector()

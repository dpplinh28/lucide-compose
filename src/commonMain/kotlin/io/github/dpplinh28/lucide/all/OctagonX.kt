package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("OctagonX") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(15f, 9f)
                lineToRelative(-6f, 6f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.586f, 16.726f)
                arcTo(2f, 2f, 0f, false, true, 2f, 15.312f)
                verticalLineTo(8.688f)
                arcToRelative(2f, 2f, 0f, false, true, .586f, -1.414f)
                lineToRelative(4.688f, -4.688f)
                arcTo(2f, 2f, 0f, false, true, 8.688f, 2f)
                horizontalLineToRelative(6.624f)
                arcToRelative(2f, 2f, 0f, false, true, 1.414f, .586f)
                lineToRelative(4.688f, 4.688f)
                arcTo(2f, 2f, 0f, false, true, 22f, 8.688f)
                verticalLineToRelative(6.624f)
                arcToRelative(2f, 2f, 0f, false, true, -.586f, 1.414f)
                lineToRelative(-4.688f, 4.688f)
                arcToRelative(2f, 2f, 0f, false, true, -1.414f, .586f)
                horizontalLineTo(8.688f)
                arcToRelative(2f, 2f, 0f, false, true, -1.414f, -.586f)
                close()
            }
            lucidePath(strokeWidth) {
                moveToRelative(9f, 9f)
                lineToRelative(6f, 6f)
            }
}

public val LucideIcons.All.OctagonXDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.OctagonX: ImageVector
    @Composable get() = OctagonXDefinition.asImageVector()

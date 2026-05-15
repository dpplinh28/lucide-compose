package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("OctagonAlert") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 16f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 8f)
                verticalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.312f, 2f)
                arcToRelative(2f, 2f, 0f, false, true, 1.414f, .586f)
                lineToRelative(4.688f, 4.688f)
                arcTo(2f, 2f, 0f, false, true, 22f, 8.688f)
                verticalLineToRelative(6.624f)
                arcToRelative(2f, 2f, 0f, false, true, -.586f, 1.414f)
                lineToRelative(-4.688f, 4.688f)
                arcToRelative(2f, 2f, 0f, false, true, -1.414f, .586f)
                horizontalLineTo(8.688f)
                arcToRelative(2f, 2f, 0f, false, true, -1.414f, -.586f)
                lineToRelative(-4.688f, -4.688f)
                arcTo(2f, 2f, 0f, false, true, 2f, 15.312f)
                verticalLineTo(8.688f)
                arcToRelative(2f, 2f, 0f, false, true, .586f, -1.414f)
                lineToRelative(4.688f, -4.688f)
                arcTo(2f, 2f, 0f, false, true, 8.688f, 2f)
                close()
            }
}

public val LucideIcons.All.OctagonAlertDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.OctagonAlert: ImageVector
    @Composable get() = OctagonAlertDefinition.asImageVector()

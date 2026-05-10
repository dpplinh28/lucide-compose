package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("GlobeOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.114f, 4.462f)
                arcTo(14.5f, 14.5f, 0f, false, true, 12f, 2f)
                arcToRelative(10f, 10f, 0f, false, true, 9.313f, 13.643f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.557f, 15.556f)
                arcTo(14.5f, 14.5f, 0f, false, true, 12f, 22f)
                arcTo(10f, 10f, 0f, false, true, 4.929f, 4.929f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.892f, 10.234f)
                arcTo(14.5f, 14.5f, 0f, false, false, 12f, 2f)
                arcToRelative(10f, 10f, 0f, false, false, -3.643f, .687f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.656f, 12f)
                horizontalLineTo(22f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.071f, 19.071f)
                arcTo(10f, 10f, 0f, false, true, 12f, 22f)
                arcTo(14.5f, 14.5f, 0f, false, true, 8.44f, 8.45f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 12f)
                horizontalLineToRelative(10f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(2f, 2f)
                lineToRelative(20f, 20f)
            }
}

public val LucideIcons.All.GlobeOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.GlobeOff: ImageVector
    @Composable get() = GlobeOffDefinition.asImageVector()

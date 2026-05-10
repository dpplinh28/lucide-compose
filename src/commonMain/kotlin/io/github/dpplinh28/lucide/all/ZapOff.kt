package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ZapOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.513f, 4.856f)
                lineTo(13.12f, 2.17f)
                arcToRelative(.5f, .5f, 0f, false, true, .86f, .46f)
                lineToRelative(-1.377f, 4.317f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.656f, 10f)
                horizontalLineTo(20f)
                arcToRelative(1f, 1f, 0f, false, true, .78f, 1.63f)
                lineToRelative(-1.72f, 1.773f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.273f, 16.273f)
                lineTo(10.88f, 21.83f)
                arcToRelative(.5f, .5f, 0f, false, true, -.86f, -.46f)
                lineToRelative(1.92f, -6.02f)
                arcTo(1f, 1f, 0f, false, false, 11f, 14f)
                horizontalLineTo(4f)
                arcToRelative(1f, 1f, 0f, false, true, -.78f, -1.63f)
                lineToRelative(4.507f, -4.643f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(2f, 2f)
                lineToRelative(20f, 20f)
            }
}

public val LucideIcons.All.ZapOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ZapOff: ImageVector
    @Composable get() = ZapOffDefinition.asImageVector()

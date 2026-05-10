package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Hash") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4f, 9f)
                lineTo(20f, 9f)
            }
            lucidePath(strokeWidth) {
                moveTo(4f, 15f)
                lineTo(20f, 15f)
            }
            lucidePath(strokeWidth) {
                moveTo(10f, 3f)
                lineTo(8f, 21f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 3f)
                lineTo(14f, 21f)
            }
}

public val LucideIcons.All.HashDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Hash: ImageVector
    @Composable get() = HashDefinition.asImageVector()
